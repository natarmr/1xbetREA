.class public final synthetic La/rwy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fql0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/fql0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rwy;->a:B

    iput-object p1, p0, La/rwy;->b:La/fql0;

    iput-object p2, p0, La/rwy;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/rwy;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/rwy;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/rwy;->b:La/fql0;

    .line 6
    .line 7
    check-cast p1, La/h2l0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La/fql0;->g:La/sfl0;

    .line 16
    .line 17
    sget-object v0, La/sfl0;->c:La/sfl0;

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    sget-object v0, La/sfl0;->b:La/sfl0;

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, La/p62;

    .line 27
    .line 28
    invoke-direct {p1, p0}, La/p62;-><init>(La/fql0;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    new-instance p1, La/j62;

    .line 36
    .line 37
    iget-wide v2, p0, La/fql0;->a:J

    .line 38
    .line 39
    invoke-direct {p1, v2, v3}, La/j62;-><init>(J)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/fql0;->g:La/sfl0;

    .line 52
    .line 53
    sget-object v0, La/sfl0;->c:La/sfl0;

    .line 54
    .line 55
    if-eq p1, v0, :cond_3

    .line 56
    .line 57
    sget-object v0, La/sfl0;->b:La/sfl0;

    .line 58
    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    new-instance p1, La/p62;

    .line 63
    .line 64
    invoke-direct {p1, p0}, La/p62;-><init>(La/fql0;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    :goto_2
    new-instance p1, La/j62;

    .line 72
    .line 73
    iget-wide v2, p0, La/fql0;->a:J

    .line 74
    .line 75
    invoke-direct {p1, v2, v3}, La/j62;-><init>(J)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, La/fql0;->g:La/sfl0;

    .line 88
    .line 89
    sget-object v0, La/sfl0;->c:La/sfl0;

    .line 90
    .line 91
    if-eq p1, v0, :cond_5

    .line 92
    .line 93
    sget-object v0, La/sfl0;->b:La/sfl0;

    .line 94
    .line 95
    if-ne p1, v0, :cond_4

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_4
    new-instance p1, La/p62;

    .line 99
    .line 100
    invoke-direct {p1, p0}, La/p62;-><init>(La/fql0;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    :goto_4
    new-instance p1, La/j62;

    .line 108
    .line 109
    iget-wide v2, p0, La/fql0;->a:J

    .line 110
    .line 111
    invoke-direct {p1, v2, v3}, La/j62;-><init>(J)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, La/fql0;->g:La/sfl0;

    .line 124
    .line 125
    sget-object v0, La/sfl0;->c:La/sfl0;

    .line 126
    .line 127
    if-eq p1, v0, :cond_7

    .line 128
    .line 129
    sget-object v0, La/sfl0;->b:La/sfl0;

    .line 130
    .line 131
    if-ne p1, v0, :cond_6

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_6
    new-instance p1, La/p62;

    .line 135
    .line 136
    invoke-direct {p1, p0}, La/p62;-><init>(La/fql0;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_7
    :goto_6
    new-instance p1, La/j62;

    .line 144
    .line 145
    iget-wide v2, p0, La/fql0;->a:J

    .line 146
    .line 147
    invoke-direct {p1, v2, v3}, La/j62;-><init>(J)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
