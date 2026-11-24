.class public final synthetic La/pzk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/szq;


# direct methods
.method public synthetic constructor <init>(La/szq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pzk;->a:B

    iput-object p1, p0, La/pzk;->b:La/szq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/pzk;->a:B

    .line 2
    .line 3
    const/16 v1, 0xc8

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/pzk;->b:La/szq;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Landroid/view/View;

    .line 13
    .line 14
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/szq;->b:La/e0f;

    .line 20
    .line 21
    iget-object p0, p0, La/e0f;->n:Landroid/view/View;

    .line 22
    .line 23
    check-cast p0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 24
    .line 25
    iget-byte p1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->j:B

    .line 26
    .line 27
    iget v0, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->h:I

    .line 28
    .line 29
    iget-boolean v4, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->m:Z

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    iget v4, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->o:I

    .line 34
    .line 35
    add-int/2addr p1, v0

    .line 36
    sub-int/2addr v4, p1

    .line 37
    iput v4, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->o:I

    .line 38
    .line 39
    invoke-virtual {p0, v1, v2}, Lorg/xplatform/domino/presentation/views/DominoHandView;->a(IZ)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->e:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    mul-int/2addr v1, p1

    .line 49
    iget p1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->o:I

    .line 50
    .line 51
    neg-int p1, p1

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    sub-int/2addr v1, v4

    .line 57
    add-int/2addr v1, v0

    .line 58
    if-ge p1, v1, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v2, v3

    .line 62
    :goto_0
    iput-boolean v2, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->m:Z

    .line 63
    .line 64
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 68
    .line 69
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, La/szq;->b:La/e0f;

    .line 75
    .line 76
    iget-object p0, p0, La/e0f;->n:Landroid/view/View;

    .line 77
    .line 78
    check-cast p0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 79
    .line 80
    iget p1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->h:I

    .line 81
    .line 82
    iget-boolean v0, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->l:Z

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    iget v0, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->o:I

    .line 87
    .line 88
    iget-byte v4, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->j:B

    .line 89
    .line 90
    add-int/2addr v4, p1

    .line 91
    add-int/2addr v4, v0

    .line 92
    iput v4, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->o:I

    .line 93
    .line 94
    invoke-virtual {p0, v1, v2}, Lorg/xplatform/domino/presentation/views/DominoHandView;->a(IZ)V

    .line 95
    .line 96
    .line 97
    iget v0, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->o:I

    .line 98
    .line 99
    if-ge v0, p1, :cond_2

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move v2, v3

    .line 103
    :goto_1
    iput-boolean v2, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->l:Z

    .line 104
    .line 105
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    iget-object p0, p0, La/szq;->b:La/e0f;

    .line 109
    .line 110
    check-cast p1, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 117
    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    const/16 v3, 0x8

    .line 122
    .line 123
    :goto_2
    iget-object p1, p0, La/e0f;->g:Landroid/view/View;

    .line 124
    .line 125
    check-cast p1, Landroid/widget/ImageView;

    .line 126
    .line 127
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    iget-object p0, p0, La/e0f;->i:Landroid/view/View;

    .line 131
    .line 132
    check-cast p0, Landroid/widget/ImageView;

    .line 133
    .line 134
    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
