package com.landq.cricketdrs.tools;

import org.springframework.stereotype.Component;

@Component
public class SnickoMeterTool {
		private boolean sound;
		public void setSound(boolean sound){
			this.sound=sound;
		}
		public boolean getSound(){
			return sound;
		}
		public boolean isEdge(){
			if(sound){
				return true;
			}
			else{
				return false;
			}
		}
}
