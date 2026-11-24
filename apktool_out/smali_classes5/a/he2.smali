.class public final La/he2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/le2;


# direct methods
.method public synthetic constructor <init>(La/le2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/he2;->a:B

    iput-object p1, p0, La/he2;->b:La/le2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte p2, p0, La/he2;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/he2;->b:La/le2;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget p1, La/le2;->F:I

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, La/le2;->M(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 26
    .line 27
    new-instance p2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/fhb;

    .line 47
    .line 48
    iget-object v0, v0, La/fhb;->h:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {p2, v0}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    sget p1, La/le2;->F:I

    .line 55
    .line 56
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 57
    .line 58
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 68
    .line 69
    move-object v2, v0

    .line 70
    check-cast v2, La/ce2;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance v5, La/yhe;

    .line 76
    .line 77
    invoke-direct {v5, p2}, La/yhe;-><init>(Ljava/util/ArrayList;)V

    .line 78
    .line 79
    .line 80
    const/4 v11, 0x0

    .line 81
    const/16 v12, 0x3ff9

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    const/4 v4, 0x0

    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    invoke-static/range {v2 .. v12}, La/ce2;->a(La/ce2;Ljava/lang/String;ZLa/hie;IZLjava/util/List;La/wcb;ZZI)La/ce2;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    new-instance p1, La/za;

    .line 101
    .line 102
    const/16 v0, 0x8

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    invoke-direct {p1, p0, p2, v1, v0}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 106
    .line 107
    .line 108
    const/4 p2, 0x3

    .line 109
    invoke-static {p0, v1, v1, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
