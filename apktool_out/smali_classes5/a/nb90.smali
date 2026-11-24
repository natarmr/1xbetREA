.class public final La/nb90;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v0, :cond_7

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    if-ge v3, v4, :cond_0

    .line 11
    .line 12
    move v4, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v5, 0x4

    .line 15
    if-ge v3, v5, :cond_1

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/16 v6, 0x8

    .line 20
    .line 21
    if-ge v3, v6, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    const/16 v4, 0x10

    .line 25
    .line 26
    if-ge v3, v4, :cond_3

    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    goto :goto_1

    .line 30
    :cond_3
    const/16 v4, 0x20

    .line 31
    .line 32
    if-ge v3, v4, :cond_4

    .line 33
    .line 34
    move v4, v5

    .line 35
    goto :goto_1

    .line 36
    :cond_4
    const/16 v4, 0x40

    .line 37
    .line 38
    if-ge v3, v4, :cond_5

    .line 39
    .line 40
    const/4 v4, 0x5

    .line 41
    goto :goto_1

    .line 42
    :cond_5
    const/16 v4, 0x80

    .line 43
    .line 44
    if-ge v3, v4, :cond_6

    .line 45
    .line 46
    const/4 v4, 0x6

    .line 47
    goto :goto_1

    .line 48
    :cond_6
    const/4 v4, 0x7

    .line 49
    :goto_1
    aput v4, v1, v3

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_7
    sput-object v1, La/nb90;->a:[I

    .line 55
    .line 56
    return-void
.end method
