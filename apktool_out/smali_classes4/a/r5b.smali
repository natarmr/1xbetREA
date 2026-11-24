.class public abstract synthetic La/r5b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    invoke-static {}, La/tcp;->values()[La/tcp;

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
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    :try_start_0
    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    :catch_0
    const/4 v1, 0x2

    .line 13
    :try_start_1
    sget-object v3, La/tcp;->b:La/tcp;

    .line 14
    .line 15
    aput v1, v0, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 16
    .line 17
    :catch_1
    const/4 v3, 0x3

    .line 18
    :try_start_2
    sget-object v4, La/tcp;->b:La/tcp;

    .line 19
    .line 20
    aput v3, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 21
    .line 22
    :catch_2
    const/4 v4, 0x4

    .line 23
    :try_start_3
    sget-object v5, La/tcp;->b:La/tcp;

    .line 24
    .line 25
    aput v4, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 26
    .line 27
    :catch_3
    const/4 v5, 0x5

    .line 28
    :try_start_4
    sget-object v6, La/tcp;->b:La/tcp;

    .line 29
    .line 30
    aput v5, v0, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 31
    .line 32
    :catch_4
    const/4 v4, 0x6

    .line 33
    :try_start_5
    sget-object v6, La/tcp;->b:La/tcp;

    .line 34
    .line 35
    aput v4, v0, v5
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 36
    .line 37
    :catch_5
    const/4 v5, 0x7

    .line 38
    :try_start_6
    sget-object v6, La/tcp;->b:La/tcp;

    .line 39
    .line 40
    aput v5, v0, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 41
    .line 42
    :catch_6
    :try_start_7
    sget-object v4, La/tcp;->b:La/tcp;

    .line 43
    .line 44
    const/16 v4, 0x8

    .line 45
    .line 46
    aput v4, v0, v5
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 47
    .line 48
    :catch_7
    sput-object v0, La/r5b;->a:[I

    .line 49
    .line 50
    invoke-static {}, Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;->values()[Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    array-length v0, v0

    .line 55
    new-array v0, v0, [I

    .line 56
    .line 57
    :try_start_8
    aput v2, v0, v2
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 58
    .line 59
    :catch_8
    :try_start_9
    sget-object v2, Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 60
    .line 61
    aput v1, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 62
    .line 63
    :catch_9
    :try_start_a
    sget-object v1, Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 64
    .line 65
    aput v3, v0, v3
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    .line 66
    .line 67
    :catch_a
    return-void
.end method
