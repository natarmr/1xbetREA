.class public final La/o4p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q4p0;


# direct methods
.method public synthetic constructor <init>(La/q4p0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o4p0;->a:B

    iput-object p1, p0, La/o4p0;->b:La/q4p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte p2, p0, La/o4p0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, La/o4p0;->b:La/q4p0;

    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 p2, 0x1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, La/h4p0;

    .line 23
    .line 24
    iget-object v1, v1, La/h4p0;->d:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    iget-object v1, p0, La/q4p0;->C:La/bby;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ne v1, p2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0}, La/q4p0;->M()V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    if-nez p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, La/h4p0;

    .line 54
    .line 55
    iget-object p1, p1, La/h4p0;->d:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 64
    .line 65
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 66
    .line 67
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 75
    .line 76
    move-object v3, v1

    .line 77
    check-cast v3, La/h4p0;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    const/16 v4, 0x1a

    .line 84
    .line 85
    invoke-static {v3, v0, p2, v2, v4}, La/h4p0;->a(La/h4p0;ZZLjava/util/List;I)La/h4p0;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {p1, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 99
    .line 100
    sget p2, La/q4p0;->D:I

    .line 101
    .line 102
    iget-object p2, p0, La/i3t0;->i:La/ocj;

    .line 103
    .line 104
    iget-object p2, p2, La/ocj;->a:La/p7m0;

    .line 105
    .line 106
    :cond_4
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 114
    .line 115
    move-object v3, v1

    .line 116
    check-cast v3, La/h4p0;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/16 v2, 0x10

    .line 122
    .line 123
    invoke-static {v3, v0, v0, p1, v2}, La/h4p0;->a(La/h4p0;ZZLjava/util/List;I)La/h4p0;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {p2, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_4

    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
