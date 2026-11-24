.class public abstract La/j70;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/vo80;

.field public static final b:La/uo80;

.field public static final c:La/yky;

.field public static final d:La/rky;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 2
    .line 3
    invoke-static {v0}, La/utt0;->b(Ljava/lang/String;)La/sg9;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/vo80;

    .line 8
    .line 9
    const-class v2, La/i70;

    .line 10
    .line 11
    invoke-direct {v1, v2}, La/vo80;-><init>(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/j70;->a:La/vo80;

    .line 15
    .line 16
    new-instance v1, La/uo80;

    .line 17
    .line 18
    invoke-direct {v1, v0}, La/uo80;-><init>(La/sg9;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, La/j70;->b:La/uo80;

    .line 22
    .line 23
    new-instance v1, La/yky;

    .line 24
    .line 25
    const-class v2, La/e70;

    .line 26
    .line 27
    invoke-direct {v1, v2}, La/yky;-><init>(Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, La/j70;->c:La/yky;

    .line 31
    .line 32
    new-instance v1, La/jf4;

    .line 33
    .line 34
    const/16 v2, 0xd

    .line 35
    .line 36
    invoke-direct {v1, v2}, La/jf4;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v2, La/rky;

    .line 40
    .line 41
    invoke-direct {v2, v0, v1}, La/rky;-><init>(La/sg9;La/sky;)V

    .line 42
    .line 43
    .line 44
    sput-object v2, La/j70;->d:La/rky;

    .line 45
    .line 46
    return-void
.end method
