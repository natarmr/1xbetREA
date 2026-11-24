.class public abstract La/prw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/h7x0;

.field public static final b:La/yqw0;

.field public static final c:La/zqw0;

.field public static final d:La/l5x0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/epw0;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/epw0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/h7x0;

    .line 9
    .line 10
    const-class v2, La/nrw0;

    .line 11
    .line 12
    const-class v3, La/tmw0;

    .line 13
    .line 14
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, La/prw0;->a:La/h7x0;

    .line 18
    .line 19
    new-instance v0, La/yqw0;

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-direct {v0, v1}, La/yqw0;-><init>(B)V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/prw0;->b:La/yqw0;

    .line 26
    .line 27
    new-instance v0, La/zqw0;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, La/prw0;->c:La/zqw0;

    .line 33
    .line 34
    invoke-static {}, La/kbx0;->y()La/alw0;

    .line 35
    .line 36
    .line 37
    new-instance v0, La/l5x0;

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 41
    .line 42
    invoke-direct {v0, v1, v3, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, La/prw0;->d:La/l5x0;

    .line 46
    .line 47
    return-void
.end method
