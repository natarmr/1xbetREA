.class public final synthetic La/kt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/vne;La/cgk0;La/pz40;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/kt0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kt0;->b:La/vne;

    iput-object p2, p0, La/kt0;->d:La/cgk0;

    iput-object p3, p0, La/kt0;->c:La/pz40;

    return-void
.end method

.method public synthetic constructor <init>(La/vne;La/pz40;La/cgk0;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/kt0;->a:B

    iput-object p1, p0, La/kt0;->b:La/vne;

    iput-object p2, p0, La/kt0;->c:La/pz40;

    iput-object p3, p0, La/kt0;->d:La/cgk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/kt0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, La/kt0;->b:La/vne;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v4, p1

    .line 10
    check-cast v4, La/a9q0;

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object p1, La/tvk;->a:La/rwj;

    .line 16
    .line 17
    sget-object p1, La/ys10;->a:La/vs10;

    .line 18
    .line 19
    invoke-virtual {p1}, La/vs10;->x()La/vs10;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v3, La/vge0;

    .line 24
    .line 25
    const/4 v8, 0x2

    .line 26
    iget-object v5, p0, La/kt0;->c:La/pz40;

    .line 27
    .line 28
    iget-object v6, p0, La/kt0;->d:La/cgk0;

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    invoke-direct/range {v3 .. v8}, La/vge0;-><init>(La/a9q0;La/pz40;La/cgk0;La/yje;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, p1, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    move-object v4, p1

    .line 41
    check-cast v4, La/a9q0;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object p1, La/tvk;->a:La/rwj;

    .line 47
    .line 48
    sget-object p1, La/ys10;->a:La/vs10;

    .line 49
    .line 50
    invoke-virtual {p1}, La/vs10;->x()La/vs10;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v3, La/vge0;

    .line 55
    .line 56
    const/4 v8, 0x1

    .line 57
    iget-object v5, p0, La/kt0;->c:La/pz40;

    .line 58
    .line 59
    iget-object v6, p0, La/kt0;->d:La/cgk0;

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-direct/range {v3 .. v8}, La/vge0;-><init>(La/a9q0;La/pz40;La/cgk0;La/yje;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2, p1, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_1
    move-object v4, p1

    .line 72
    check-cast v4, La/a9q0;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object p1, La/tvk;->a:La/rwj;

    .line 78
    .line 79
    sget-object p1, La/ys10;->a:La/vs10;

    .line 80
    .line 81
    invoke-virtual {p1}, La/vs10;->x()La/vs10;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v3, La/vge0;

    .line 86
    .line 87
    const/4 v8, 0x0

    .line 88
    iget-object v5, p0, La/kt0;->c:La/pz40;

    .line 89
    .line 90
    iget-object v6, p0, La/kt0;->d:La/cgk0;

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-direct/range {v3 .. v8}, La/vge0;-><init>(La/a9q0;La/pz40;La/cgk0;La/yje;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v2, p1, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_2
    check-cast p1, La/a9q0;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    sget-object v0, La/tvk;->a:La/rwj;

    .line 108
    .line 109
    sget-object v0, La/ys10;->a:La/vs10;

    .line 110
    .line 111
    invoke-virtual {v0}, La/vs10;->x()La/vs10;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v3, La/qa;

    .line 116
    .line 117
    const/16 v4, 0xd

    .line 118
    .line 119
    iget-object v5, p0, La/kt0;->d:La/cgk0;

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    invoke-direct {v3, p1, v5, v6, v4}, La/qa;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v0, v6, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, La/a9q0;->f()Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget-object p0, p0, La/kt0;->c:La/pz40;

    .line 137
    .line 138
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
