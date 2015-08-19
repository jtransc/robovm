/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.cloudkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKNotificationInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKNotificationInfoPtr extends Ptr<CKNotificationInfo, CKNotificationInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKNotificationInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKNotificationInfo() {}
    protected CKNotificationInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "alertBody")
    public native String getAlertBody();
    @Property(selector = "setAlertBody:")
    public native void setAlertBody(String v);
    @Property(selector = "alertLocalizationKey")
    public native String getAlertLocalizationKey();
    @Property(selector = "setAlertLocalizationKey:")
    public native void setAlertLocalizationKey(String v);
    @Property(selector = "alertLocalizationArgs")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAlertLocalizationArgs();
    @Property(selector = "setAlertLocalizationArgs:")
    public native void setAlertLocalizationArgs(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "alertActionLocalizationKey")
    public native String getAlertActionLocalizationKey();
    @Property(selector = "setAlertActionLocalizationKey:")
    public native void setAlertActionLocalizationKey(String v);
    @Property(selector = "alertLaunchImage")
    public native String getAlertLaunchImage();
    @Property(selector = "setAlertLaunchImage:")
    public native void setAlertLaunchImage(String v);
    @Property(selector = "soundName")
    public native String getSoundName();
    @Property(selector = "setSoundName:")
    public native void setSoundName(String v);
    @Property(selector = "desiredKeys")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getDesiredKeys();
    @Property(selector = "setDesiredKeys:")
    public native void setDesiredKeys(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "shouldBadge")
    public native boolean shouldBadge();
    @Property(selector = "setShouldBadge:")
    public native void setShouldBadge(boolean v);
    @Property(selector = "shouldSendContentAvailable")
    public native boolean shouldSendContentAvailable();
    @Property(selector = "setShouldSendContentAvailable:")
    public native void setShouldSendContentAvailable(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "category")
    public native String getCategory();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setCategory:")
    public native void setCategory(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
