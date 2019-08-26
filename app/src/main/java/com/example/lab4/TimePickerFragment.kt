package com.example.lab4

class TimePickerFragment : DialogFragment(),TimePickerDialog.OnTimeSetListener{
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        return TimePickerDialog(activity, 2, this,hour,minute, true )
    }

    override fun onTimeSet(view: TimePicker,hourOfDay: Int, minute: Int) {
        val minuteNew: String = if (minute<10) "0${minute.toString()}" else minute.toString()
        activity?.findViewById<TextView>(R.id.text_time)?.text
    }

    override fun onCancel(dialog: DialogInterface?) {
        Toast.makeText(activity, "Please select a time.", Toast.LENGTH_SHORT).show()
        super.onCancel(dialog)
    }

}