.class public abstract La/u4m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/knl;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/knl;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, La/u4m;->a:La/n0o0;

    .line 13
    .line 14
    return-void
.end method

.method public static a(ILa/z4m;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, La/x4m;->a:La/x4m;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, La/u4m;->a:La/n0o0;

    .line 10
    .line 11
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/text/DecimalFormat;

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    instance-of p1, p1, La/y4m;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    const/16 v0, 0x176f

    .line 35
    .line 36
    invoke-static {p0, p1, v0}, La/l1e0;->d(III)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    div-int/lit8 p1, p0, 0x3c

    .line 41
    .line 42
    rem-int/lit8 p0, p0, 0x3c

    .line 43
    .line 44
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/4 p1, 0x2

    .line 61
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p1, "%02d:%02d"

    .line 66
    .line 67
    invoke-static {v0, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method
