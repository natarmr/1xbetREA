.class public final synthetic La/xnk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gok;

.field public final synthetic c:La/qdz;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/gok;La/qdz;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p4, 0x1

    iput-byte p4, p0, La/xnk;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xnk;->b:La/gok;

    iput-object p2, p0, La/xnk;->c:La/qdz;

    iput-object p3, p0, La/xnk;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/gok;Lkotlin/jvm/functions/Function1;La/qdz;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/xnk;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xnk;->b:La/gok;

    iput-object p2, p0, La/xnk;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/xnk;->c:La/qdz;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/xnk;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/xnk;->d:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object v3, p0, La/xnk;->c:La/qdz;

    .line 7
    .line 8
    iget-object p0, p0, La/xnk;->b:La/gok;

    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p0, v3, v2, p1, p2}, La/dub;->p(La/gok;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    and-int/lit8 v0, p2, 0x3

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x0

    .line 38
    if-eq v0, v4, :cond_0

    .line 39
    .line 40
    move v0, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v0, v5

    .line 43
    :goto_0
    and-int/2addr p2, v1

    .line 44
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    move-object p2, p0

    .line 51
    check-cast p2, La/eok;

    .line 52
    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    instance-of v0, p2, La/cok;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    const p2, 0x4d23f270    # 1.7191091E8f

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 63
    .line 64
    .line 65
    check-cast p0, La/cok;

    .line 66
    .line 67
    iget-object p0, p0, La/cok;->d:La/boa;

    .line 68
    .line 69
    invoke-static {p0, v2, p1, v5}, La/dub;->d(La/boa;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    instance-of p2, p2, La/dok;

    .line 77
    .line 78
    if-eqz p2, :cond_2

    .line 79
    .line 80
    const p2, 0x4d28abec    # 1.7686496E8f

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 84
    .line 85
    .line 86
    check-cast p0, La/dok;

    .line 87
    .line 88
    iget-object p2, p0, La/dok;->a:Ljava/lang/String;

    .line 89
    .line 90
    new-instance v0, La/svj;

    .line 91
    .line 92
    const/16 v1, 0xd

    .line 93
    .line 94
    invoke-direct {v0, v1}, La/svj;-><init>(B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, p2, v0, p1, v5}, La/qdz;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/fet;I)La/xcz;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    iget-object p0, p0, La/dok;->d:La/i8m;

    .line 102
    .line 103
    invoke-static {p0, p2, v2, p1, v5}, La/dub;->F(La/i8m;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    const p0, 0x27cff55

    .line 111
    .line 112
    .line 113
    invoke-static {p0, p1, v5}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    throw p0

    .line 118
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 119
    .line 120
    .line 121
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
