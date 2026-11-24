.class public abstract synthetic La/pk10;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    invoke-static {}, La/uk10;->values()[La/uk10;

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
    sget-object v2, La/uk10;->Companion:La/tk10;

    .line 10
    .line 11
    aput v1, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    :catch_0
    const/4 v2, 0x2

    .line 14
    :try_start_1
    sget-object v3, La/uk10;->Companion:La/tk10;

    .line 15
    .line 16
    aput v2, v0, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 17
    .line 18
    :catch_1
    :try_start_2
    sget-object v3, La/uk10;->Companion:La/tk10;

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    aput v3, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 22
    .line 23
    :catch_2
    :try_start_3
    sget-object v3, La/uk10;->Companion:La/tk10;

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    aput v3, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 27
    .line 28
    :catch_3
    :try_start_4
    sget-object v3, La/uk10;->Companion:La/tk10;

    .line 29
    .line 30
    const/4 v3, 0x6

    .line 31
    const/4 v4, 0x5

    .line 32
    aput v4, v0, v3
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 33
    .line 34
    :catch_4
    sput-object v0, La/pk10;->a:[I

    .line 35
    .line 36
    invoke-static {}, La/de8;->values()[La/de8;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    array-length v0, v0

    .line 41
    new-array v0, v0, [I

    .line 42
    .line 43
    :try_start_5
    sget-object v3, La/de8;->Companion:La/ce8;

    .line 44
    .line 45
    aput v1, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 46
    .line 47
    :catch_5
    :try_start_6
    sget-object v1, La/de8;->Companion:La/ce8;

    .line 48
    .line 49
    aput v2, v0, v2
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 50
    .line 51
    :catch_6
    sput-object v0, La/pk10;->b:[I

    .line 52
    .line 53
    return-void
.end method
