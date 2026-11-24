.class public final synthetic La/lam0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nam0;


# direct methods
.method public synthetic constructor <init>(La/nam0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lam0;->a:B

    iput-object p1, p0, La/lam0;->b:La/nam0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lam0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/lam0;->b:La/nam0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/nam0;->U1:La/s2m0;

    .line 11
    .line 12
    iget-object v0, v0, La/nam0;->O1:La/kiu0;

    .line 13
    .line 14
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/tam0;

    .line 19
    .line 20
    iget-object v1, v0, La/tam0;->n:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v2, v0, La/tam0;->o:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    iget-object v0, v0, La/tam0;->l:La/ol60;

    .line 31
    .line 32
    sget-object v1, La/k9m0;->a:La/k9m0;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, La/tam0;->x()V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    sget-object v1, La/nam0;->U1:La/s2m0;

    .line 45
    .line 46
    new-instance v1, La/o9m0;

    .line 47
    .line 48
    new-instance v2, La/nfj0;

    .line 49
    .line 50
    iget-object v10, v0, La/nam0;->O1:La/kiu0;

    .line 51
    .line 52
    invoke-virtual {v10}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v4, v3

    .line 57
    check-cast v4, La/tam0;

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v9, 0x7

    .line 61
    const/4 v3, 0x2

    .line 62
    const-class v14, La/tam0;

    .line 63
    .line 64
    const-string v6, "onMovedItem"

    .line 65
    .line 66
    const-string v7, "onMovedItem(II)V"

    .line 67
    .line 68
    move-object v5, v14

    .line 69
    invoke-direct/range {v2 .. v9}, La/nfj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 70
    .line 71
    .line 72
    new-instance v11, La/lph0;

    .line 73
    .line 74
    invoke-virtual {v10}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    move-object v13, v3

    .line 79
    check-cast v13, La/tam0;

    .line 80
    .line 81
    const/16 v17, 0x0

    .line 82
    .line 83
    const/16 v18, 0x18

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    const-string v15, "onUpdateEnd"

    .line 87
    .line 88
    const-string v16, "onUpdateEnd()V"

    .line 89
    .line 90
    invoke-direct/range {v11 .. v18}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 91
    .line 92
    .line 93
    move-object v3, v11

    .line 94
    new-instance v11, La/nfj0;

    .line 95
    .line 96
    invoke-virtual {v10}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    move-object v13, v4

    .line 101
    check-cast v13, La/tam0;

    .line 102
    .line 103
    const/16 v18, 0x8

    .line 104
    .line 105
    const/4 v12, 0x2

    .line 106
    const-string v15, "onSelectItemClicked"

    .line 107
    .line 108
    const-string v16, "onSelectItemClicked(IZ)V"

    .line 109
    .line 110
    invoke-direct/range {v11 .. v18}, La/nfj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 111
    .line 112
    .line 113
    new-instance v12, La/kcl0;

    .line 114
    .line 115
    iget-object v14, v0, La/nam0;->R1:La/r9m0;

    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const/16 v19, 0x10

    .line 120
    .line 121
    const/4 v13, 0x1

    .line 122
    const-class v15, La/r9m0;

    .line 123
    .line 124
    const-string v16, "startDrag"

    .line 125
    .line 126
    const-string v17, "startDrag(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V"

    .line 127
    .line 128
    invoke-direct/range {v12 .. v19}, La/kcl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v1, v2, v3, v11, v12}, La/o9m0;-><init>(La/nfj0;La/lph0;La/nfj0;La/kcl0;)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :pswitch_1
    new-instance v1, La/q0h0;

    .line 136
    .line 137
    iget-object v0, v0, La/nam0;->L1:La/wui;

    .line 138
    .line 139
    if-eqz v0, :cond_1

    .line 140
    .line 141
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 142
    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_1
    const-string v0, "viewModelFactory"

    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    throw v0

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
