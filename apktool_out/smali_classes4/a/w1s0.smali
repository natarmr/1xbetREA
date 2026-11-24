.class public final synthetic La/w1s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/ash;


# direct methods
.method public synthetic constructor <init>(La/cp;La/ash;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w1s0;->a:B

    iput-object p1, p0, La/w1s0;->b:La/cp;

    iput-object p2, p0, La/w1s0;->c:La/ash;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/w1s0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/w1s0;->c:La/ash;

    .line 4
    .line 5
    iget-object p0, p0, La/w1s0;->b:La/cp;

    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 16
    .line 17
    check-cast p1, La/gs10;

    .line 18
    .line 19
    iget-object p1, p1, La/gs10;->i:Lorg/xplatform/cyber/section/impl/championships/regular/presentation/world_cup/tournament_info/ExpandableTextView;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/v1s0;

    .line 26
    .line 27
    iget-boolean v0, v0, La/v1s0;->f:Z

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/v1s0;

    .line 36
    .line 37
    iget-object v0, v0, La/v1s0;->d:Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, La/v1s0;

    .line 45
    .line 46
    iget-object v0, v0, La/v1s0;->c:Ljava/lang/String;

    .line 47
    .line 48
    :goto_0
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, La/v1s0;

    .line 53
    .line 54
    iget-boolean v2, v2, La/v1s0;->f:Z

    .line 55
    .line 56
    invoke-virtual {p1, v0, v2}, Lorg/xplatform/cyber/section/impl/championships/regular/presentation/world_cup/tournament_info/ExpandableTextView;->j(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/v1s0;

    .line 64
    .line 65
    iget-byte p0, p0, La/v1s0;->a:B

    .line 66
    .line 67
    int-to-long p0, p0

    .line 68
    invoke-virtual {v1, p0, p1}, La/ash;->a(J)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 75
    .line 76
    check-cast p1, La/gs10;

    .line 77
    .line 78
    iget-object p1, p1, La/gs10;->i:Lorg/xplatform/cyber/section/impl/championships/regular/presentation/world_cup/tournament_info/ExpandableTextView;

    .line 79
    .line 80
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/v1s0;

    .line 85
    .line 86
    iget-boolean v0, v0, La/v1s0;->f:Z

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/v1s0;

    .line 95
    .line 96
    iget-object v0, v0, La/v1s0;->d:Ljava/lang/String;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/v1s0;

    .line 104
    .line 105
    iget-object v0, v0, La/v1s0;->c:Ljava/lang/String;

    .line 106
    .line 107
    :goto_1
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, La/v1s0;

    .line 112
    .line 113
    iget-boolean v2, v2, La/v1s0;->f:Z

    .line 114
    .line 115
    invoke-virtual {p1, v0, v2}, Lorg/xplatform/cyber/section/impl/championships/regular/presentation/world_cup/tournament_info/ExpandableTextView;->j(Ljava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, La/v1s0;

    .line 123
    .line 124
    iget-byte p0, p0, La/v1s0;->a:B

    .line 125
    .line 126
    int-to-long p0, p0

    .line 127
    invoke-virtual {v1, p0, p1}, La/ash;->a(J)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
