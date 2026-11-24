.class public abstract La/qx40;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:La/chf0;

.field public static final b:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qx40;->b:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, La/qx40;->b:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    sput-object p0, La/qx40;->a:La/chf0;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static b(Landroid/app/Application;Ljava/util/Set;)La/chf0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, La/qx40;->b:Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    check-cast p1, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    sget-object p1, La/qx40;->a:La/chf0;

    .line 15
    .line 16
    if-nez p1, :cond_4

    .line 17
    .line 18
    instance-of p1, p0, La/af3;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    check-cast p0, La/af3;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p0, v0

    .line 27
    :goto_0
    const-class p1, La/tx40;

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0, p1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/o5d0;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, La/ze3;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object p0, v0

    .line 51
    :goto_1
    instance-of v1, p0, La/tx40;

    .line 52
    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    move-object p0, v0

    .line 56
    :cond_2
    check-cast p0, La/tx40;

    .line 57
    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    new-instance p0, La/chf0;

    .line 61
    .line 62
    const/16 p1, 0x1c

    .line 63
    .line 64
    invoke-direct {p0, p1}, La/chf0;-><init>(B)V

    .line 65
    .line 66
    .line 67
    new-instance p1, La/gji;

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    const/16 v1, 0x9

    .line 71
    .line 72
    invoke-direct {p1, p0, v0, v1}, La/gji;-><init>(Ljava/lang/Object;IB)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, La/chf0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    new-instance p1, La/gji;

    .line 82
    .line 83
    const/4 v0, 0x0

    .line 84
    invoke-direct {p1, p0, v0, v1}, La/gji;-><init>(Ljava/lang/Object;IB)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, La/chf0;->c:Ljava/lang/Object;

    .line 92
    .line 93
    sput-object p0, La/qx40;->a:La/chf0;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 97
    .line 98
    invoke-static {p1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_4
    return-object p1
.end method
