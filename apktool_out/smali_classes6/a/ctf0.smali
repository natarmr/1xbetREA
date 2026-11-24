.class public final La/ctf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ksm0;

.field public final b:La/lsm0;

.field public final c:La/q4d;

.field public final d:La/pmk;

.field public final e:La/ihk;

.field public final f:La/wyu;


# direct methods
.method public constructor <init>(La/ksm0;La/lsm0;La/q4d;La/pmk;La/ihk;La/wrq;La/wyu;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/ctf0;->a:La/ksm0;

    .line 26
    .line 27
    iput-object p2, p0, La/ctf0;->b:La/lsm0;

    .line 28
    .line 29
    iput-object p3, p0, La/ctf0;->c:La/q4d;

    .line 30
    .line 31
    iput-object p4, p0, La/ctf0;->d:La/pmk;

    .line 32
    .line 33
    iput-object p5, p0, La/ctf0;->e:La/ihk;

    .line 34
    .line 35
    iput-object p7, p0, La/ctf0;->f:La/wyu;

    .line 36
    .line 37
    return-void
.end method

.method public static b(ILa/ctf0;)I
    .locals 2

    .line 1
    iget-object v0, p1, La/ctf0;->c:La/q4d;

    .line 2
    .line 3
    iget-object p1, p1, La/ctf0;->f:La/wyu;

    .line 4
    .line 5
    invoke-virtual {p1}, La/wyu;->a()La/uaq0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, La/fem0;->o(La/uaq0;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object v0, v0, La/q4d;->a:La/us00;

    .line 14
    .line 15
    invoke-static {p1, v0}, La/m5d;->e(ILandroid/content/Context;)Landroid/content/res/Resources$Theme;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v0, p0, v1, p1}, La/m5d;->f(Landroid/content/Context;IZLandroid/content/res/Resources$Theme;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public static e(La/ctf0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length p0, p2

    .line 13
    invoke-static {p2, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    array-length p2, p0

    .line 18
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {v0, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method


# virtual methods
.method public final a(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/ctf0;->c:La/q4d;

    .line 2
    .line 3
    iget-object p0, p0, La/q4d;->a:La/us00;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/content/Context;->getColor(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object p0, p0, La/ctf0;->e:La/ihk;

    .line 2
    .line 3
    iget-object p0, p0, La/ihk;->a:La/us00;

    .line 4
    .line 5
    invoke-virtual {p0}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 14
    .line 15
    int-to-float v0, v0

    .line 16
    invoke-virtual {p0}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 25
    .line 26
    div-float/2addr v0, p0

    .line 27
    float-to-int p0, v0

    .line 28
    return p0
.end method

.method public final d(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/ctf0;->d:La/pmk;

    .line 2
    .line 3
    iget-object p0, p0, La/pmk;->a:La/us00;

    .line 4
    .line 5
    invoke-virtual {p0}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final varargs f(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    array-length v0, p2

    .line 2
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    iget-object p0, p0, La/ctf0;->a:La/ksm0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    array-length v0, p2

    .line 12
    iget-object p0, p0, La/ksm0;->a:La/us00;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    array-length v0, p2

    .line 25
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public final g(I)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ctf0;->a:La/ksm0;

    .line 2
    .line 3
    iget-object p0, p0, La/ksm0;->a:La/us00;

    .line 4
    .line 5
    invoke-virtual {p0}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ctf0;->e:La/ihk;

    .line 2
    .line 3
    iget-object p0, p0, La/ihk;->a:La/us00;

    .line 4
    .line 5
    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ctf0;->e:La/ihk;

    .line 2
    .line 3
    iget-object p0, p0, La/ihk;->a:La/us00;

    .line 4
    .line 5
    invoke-static {p0}, La/sj3;->J(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/ctf0;->e:La/ihk;

    .line 2
    .line 3
    iget-object p0, p0, La/ihk;->a:La/us00;

    .line 4
    .line 5
    invoke-virtual {p0}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f05000f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final varargs k(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    array-length v0, p2

    .line 2
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
