.class public final synthetic La/q6p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s6p;


# direct methods
.method public synthetic constructor <init>(La/s6p;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q6p;->a:B

    iput-object p1, p0, La/q6p;->b:La/s6p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/q6p;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/q6p;->b:La/s6p;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/s6p;->o2:La/pek;

    .line 9
    .line 10
    iget-object p0, p0, La/s6p;->n2:La/kiu0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/h7p;

    .line 17
    .line 18
    sget-object v0, La/m6p;->a:La/m6p;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/h7p;->M(La/o6p;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    sget-object v0, La/s6p;->o2:La/pek;

    .line 27
    .line 28
    iget-object p0, p0, La/s6p;->m2:La/a8z;

    .line 29
    .line 30
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/qci;

    .line 35
    .line 36
    new-instance v0, La/fiu0;

    .line 37
    .line 38
    const-class v1, La/h7p;

    .line 39
    .line 40
    iget-object p0, p0, La/qci;->e:La/pai;

    .line 41
    .line 42
    invoke-static {v1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v0, p0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_1
    sget-object v0, La/s6p;->o2:La/pek;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    instance-of v1, v0, La/af3;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    check-cast v0, La/af3;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-object v0, v2

    .line 72
    :goto_0
    const-class v1, La/iqc;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/o5d0;

    .line 85
    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/ze3;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object v0, v2

    .line 96
    :goto_1
    instance-of v3, v0, La/iqc;

    .line 97
    .line 98
    if-nez v3, :cond_2

    .line 99
    .line 100
    move-object v0, v2

    .line 101
    :cond_2
    check-cast v0, La/iqc;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    iget-object v1, p0, La/s6p;->l2:La/yzn0;

    .line 106
    .line 107
    sget-object v2, La/s6p;->p2:[La/iiy;

    .line 108
    .line 109
    const/4 v3, 0x1

    .line 110
    aget-object v2, v2, v3

    .line 111
    .line 112
    invoke-virtual {v1, p0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    move-object v2, p0

    .line 117
    check-cast v2, La/wep;

    .line 118
    .line 119
    iget-object p0, v0, La/iqc;->c:La/wdd0;

    .line 120
    .line 121
    iget-object v4, v0, La/iqc;->a:La/ctf0;

    .line 122
    .line 123
    iget-object v6, v0, La/iqc;->b:La/wdk0;

    .line 124
    .line 125
    iget-object v3, v0, La/iqc;->h:La/t6p;

    .line 126
    .line 127
    iget-object v5, v0, La/iqc;->d:La/mne;

    .line 128
    .line 129
    iget-object v1, v0, La/iqc;->e:La/abp;

    .line 130
    .line 131
    iget-object v7, v0, La/iqc;->f:La/btt0;

    .line 132
    .line 133
    iget-object v0, v0, La/iqc;->g:La/gii0;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    new-instance v1, La/qci;

    .line 157
    .line 158
    invoke-direct/range {v1 .. v6}, La/qci;-><init>(La/wep;La/t6p;La/ctf0;La/mne;La/wdk0;)V

    .line 159
    .line 160
    .line 161
    move-object v2, v1

    .line 162
    goto :goto_2

    .line 163
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 164
    .line 165
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :goto_2
    return-object v2

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
