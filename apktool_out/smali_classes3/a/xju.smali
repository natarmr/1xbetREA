.class public abstract synthetic La/xju;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    invoke-static {}, La/ua20;->values()[La/ua20;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    :try_start_0
    aput v1, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    :catch_0
    const/4 v2, 0x2

    .line 12
    :try_start_1
    sget-object v3, La/ua20;->b:La/ua20;

    .line 13
    .line 14
    aput v2, v0, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    :catch_1
    const/4 v3, 0x3

    .line 17
    :try_start_2
    sget-object v4, La/ua20;->b:La/ua20;

    .line 18
    .line 19
    aput v3, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 20
    .line 21
    :catch_2
    invoke-static {}, La/j820;->values()[La/j820;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    array-length v0, v0

    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    :try_start_3
    aput v1, v0, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 30
    .line 31
    :catch_3
    :try_start_4
    sget-object v4, La/j820;->a:La/j820;

    .line 32
    .line 33
    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 34
    .line 35
    :catch_4
    const/4 v1, 0x4

    .line 36
    :try_start_5
    sget-object v4, La/j820;->a:La/j820;

    .line 37
    .line 38
    aput v3, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 39
    .line 40
    :catch_5
    :try_start_6
    sget-object v4, La/j820;->a:La/j820;

    .line 41
    .line 42
    aput v1, v0, v3
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 43
    .line 44
    :catch_6
    const/4 v1, 0x5

    .line 45
    :try_start_7
    sget-object v3, La/j820;->a:La/j820;

    .line 46
    .line 47
    aput v1, v0, v2
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 48
    .line 49
    :catch_7
    :try_start_8
    sget-object v2, La/j820;->a:La/j820;

    .line 50
    .line 51
    const/4 v2, 0x6

    .line 52
    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 53
    .line 54
    :catch_8
    sput-object v0, La/xju;->a:[I

    .line 55
    .line 56
    return-void
.end method
