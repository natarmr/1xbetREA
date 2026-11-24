.class public final synthetic La/mta0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nta0;


# direct methods
.method public synthetic constructor <init>(La/nta0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mta0;->a:B

    iput-object p1, p0, La/mta0;->b:La/nta0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/mta0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mta0;->b:La/nta0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, La/nta0;->m2:I

    .line 9
    .line 10
    iget-object p0, p0, La/nta0;->l2:La/a8z;

    .line 11
    .line 12
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/k3t0;

    .line 17
    .line 18
    sget-object v0, La/lqa0;->a:La/lqa0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    iget-object p0, p0, La/nta0;->k2:La/a8z;

    .line 27
    .line 28
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, La/poi;

    .line 33
    .line 34
    new-instance v0, La/fiu0;

    .line 35
    .line 36
    const-class v1, La/ota0;

    .line 37
    .line 38
    iget-object p0, p0, La/poi;->g:La/eni;

    .line 39
    .line 40
    invoke-static {v1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_1
    sget v0, La/nta0;->m2:I

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    instance-of v0, p0, La/af3;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    check-cast p0, La/af3;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-object p0, v1

    .line 70
    :goto_0
    const-class v0, La/pta0;

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/o5d0;

    .line 83
    .line 84
    if-eqz p0, :cond_1

    .line 85
    .line 86
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/ze3;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-object p0, v1

    .line 94
    :goto_1
    instance-of v2, p0, La/pta0;

    .line 95
    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    move-object p0, v1

    .line 99
    :cond_2
    check-cast p0, La/pta0;

    .line 100
    .line 101
    if-eqz p0, :cond_3

    .line 102
    .line 103
    iget-object v5, p0, La/pta0;->c:La/ocl;

    .line 104
    .line 105
    iget-object v6, p0, La/pta0;->e:La/knf0;

    .line 106
    .line 107
    iget-object v7, p0, La/pta0;->d:La/gii0;

    .line 108
    .line 109
    iget-object v3, p0, La/pta0;->b:La/cad;

    .line 110
    .line 111
    iget-object v0, p0, La/pta0;->a:La/ctf0;

    .line 112
    .line 113
    iget-object v4, p0, La/pta0;->f:La/xv20;

    .line 114
    .line 115
    iget-object v8, p0, La/pta0;->g:La/duj;

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v2, La/poi;

    .line 130
    .line 131
    invoke-direct/range {v2 .. v8}, La/poi;-><init>(La/cad;La/xv20;La/ocl;La/knf0;La/gii0;La/duj;)V

    .line 132
    .line 133
    .line 134
    move-object v1, v2

    .line 135
    goto :goto_2

    .line 136
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 137
    .line 138
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :goto_2
    return-object v1

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
