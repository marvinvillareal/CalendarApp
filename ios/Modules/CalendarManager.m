//
//  CalendarManager.m
//  CalendarApp
//
//  Created by baby.boy.m.villareal on 3/25/24.
//

#import <Foundation/Foundation.h>
#import "React/RCTBridgeModule.h"

@interface RCT_EXTERN_MODULE(CalendarManager, NSObject)

// RCT_EXTERN_METHOD(addEvent:(NSString)name location:(NSString)location date:(nonnull NSNumber)date)
RCT_EXTERN_METHOD(createCalendarEvent:(NSString *)title
                location:(NSString *)location
                date:(nonnull NSNumber *)date
                myCallback:(RCTResponseSenderBlock)callback)

@end

