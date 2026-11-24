.class public final enum Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/IOExceptionEventExt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Reason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

.field public static final enum KeepAliveTimeout:Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 2
    .line 3
    const-string v1, "KeepAliveTimeout"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;->KeepAliveTimeout:Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 10
    .line 11
    filled-new-array {v0}, [Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;->$VALUES:[Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;->$VALUES:[Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 2
    .line 3
    invoke-virtual {v0}, [Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 8
    .line 9
    return-object v0
.end method
