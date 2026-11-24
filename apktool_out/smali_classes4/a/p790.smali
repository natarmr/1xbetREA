.class public final La/p790;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rg90;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qog0;

.field public final synthetic c:Landroid/webkit/PermissionRequest;

.field public final synthetic d:La/yx5;


# direct methods
.method public synthetic constructor <init>(La/qog0;Landroid/webkit/PermissionRequest;La/yx5;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/p790;->a:B

    iput-object p1, p0, La/p790;->b:La/qog0;

    iput-object p2, p0, La/p790;->c:Landroid/webkit/PermissionRequest;

    iput-object p3, p0, La/p790;->d:La/yx5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/p790;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/p790;->b:La/qog0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/p790;->d:La/yx5;

    .line 8
    .line 9
    iget-object v5, p0, La/p790;->c:Landroid/webkit/PermissionRequest;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, La/whn0;

    .line 15
    .line 16
    invoke-static {p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string p1, "android.webkit.resource.VIDEO_CAPTURE"

    .line 23
    .line 24
    filled-new-array {p1}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v5, p1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const-string v6, "CAMERA_PERMISSION_DIALOG"

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    sget-object p1, La/whn0;->Y1:La/s2m0;

    .line 41
    .line 42
    invoke-virtual {v4}, La/whn0;->K0()V

    .line 43
    .line 44
    .line 45
    new-instance p1, La/thn0;

    .line 46
    .line 47
    invoke-direct {p1, v4, v5}, La/thn0;-><init>(La/whn0;Landroid/webkit/PermissionRequest;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v4, v6, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 51
    .line 52
    .line 53
    new-instance p1, La/uhn0;

    .line 54
    .line 55
    invoke-direct {p1, v5, v3}, La/uhn0;-><init>(Landroid/webkit/PermissionRequest;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v4, v6, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-static {p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    sget-object p1, La/whn0;->Y1:La/s2m0;

    .line 69
    .line 70
    invoke-virtual {v4}, La/whn0;->K0()V

    .line 71
    .line 72
    .line 73
    new-instance p1, La/thn0;

    .line 74
    .line 75
    invoke-direct {p1, v5, v4}, La/thn0;-><init>(Landroid/webkit/PermissionRequest;La/whn0;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v4, v6, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 79
    .line 80
    .line 81
    new-instance p1, La/uhn0;

    .line 82
    .line 83
    invoke-direct {p1, v5, v2}, La/uhn0;-><init>(Landroid/webkit/PermissionRequest;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v6, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_0
    iget-object p1, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 90
    .line 91
    invoke-interface {p1, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_0
    check-cast v4, La/o890;

    .line 96
    .line 97
    invoke-static {p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-virtual {v5}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v5, p1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-static {p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    sget-object p1, La/o890;->f2:La/jh70;

    .line 118
    .line 119
    invoke-virtual {v4, v3, v5}, La/o890;->O0(ZLandroid/webkit/PermissionRequest;)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    invoke-static {p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    sget-object p1, La/o890;->f2:La/jh70;

    .line 130
    .line 131
    invoke-virtual {v4, v2, v5}, La/o890;->O0(ZLandroid/webkit/PermissionRequest;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    :goto_1
    iget-object p1, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 135
    .line 136
    invoke-interface {p1, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_1
    check-cast v4, La/r790;

    .line 141
    .line 142
    invoke-static {p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    invoke-virtual {v5}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v5, p1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    invoke-static {p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_7

    .line 161
    .line 162
    sget-object p1, La/r790;->Z1:La/xi70;

    .line 163
    .line 164
    invoke-virtual {v4, v3, v5}, La/r790;->J0(ZLandroid/webkit/PermissionRequest;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_7
    invoke-static {p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    sget-object p1, La/r790;->Z1:La/xi70;

    .line 175
    .line 176
    invoke-virtual {v4, v2, v5}, La/r790;->J0(ZLandroid/webkit/PermissionRequest;)V

    .line 177
    .line 178
    .line 179
    :cond_8
    :goto_2
    iget-object p1, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 180
    .line 181
    invoke-interface {p1, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
