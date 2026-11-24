.class public abstract La/yxw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/y6x0;

.field public static final b:La/u6x0;

.field public static final c:La/j5x0;

.field public static final d:La/e5x0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/tow0;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/tow0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/y6x0;

    .line 9
    .line 10
    const-class v2, La/xtw0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/yxw0;->a:La/y6x0;

    .line 16
    .line 17
    new-instance v0, La/qow0;

    .line 18
    .line 19
    const/16 v1, 0x16

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/qow0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/u6x0;

    .line 25
    .line 26
    const-string v2, "type.googleapis.com/google.crypto.tink.XAesGcmKey"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, La/yxw0;->b:La/u6x0;

    .line 32
    .line 33
    new-instance v0, La/zow0;

    .line 34
    .line 35
    const/16 v1, 0x16

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/zow0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/j5x0;

    .line 41
    .line 42
    const-class v3, La/qtw0;

    .line 43
    .line 44
    invoke-direct {v1, v3, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, La/yxw0;->c:La/j5x0;

    .line 48
    .line 49
    new-instance v0, La/vow0;

    .line 50
    .line 51
    const/16 v1, 0x16

    .line 52
    .line 53
    invoke-direct {v0, v1}, La/vow0;-><init>(B)V

    .line 54
    .line 55
    .line 56
    new-instance v1, La/e5x0;

    .line 57
    .line 58
    invoke-direct {v1, v2, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 59
    .line 60
    .line 61
    sput-object v1, La/yxw0;->d:La/e5x0;

    .line 62
    .line 63
    return-void
.end method
