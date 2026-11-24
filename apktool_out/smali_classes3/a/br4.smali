.class public final synthetic La/br4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cr4;


# direct methods
.method public synthetic constructor <init>(La/cr4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/br4;->a:B

    iput-object p1, p0, La/br4;->b:La/cr4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/br4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/br4;->b:La/cr4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/cr4;->l2:La/a8z;

    .line 9
    .line 10
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g9i;

    .line 15
    .line 16
    new-instance v0, La/fiu0;

    .line 17
    .line 18
    const-class v1, La/gr4;

    .line 19
    .line 20
    iget-object p0, p0, La/g9i;->e:La/n8i;

    .line 21
    .line 22
    invoke-static {v1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget-object v0, La/cr4;->n2:La/pek0;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of v0, p0, La/af3;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    check-cast p0, La/af3;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object p0, v1

    .line 52
    :goto_0
    const-class v0, La/ar4;

    .line 53
    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/o5d0;

    .line 65
    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/ze3;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object p0, v1

    .line 76
    :goto_1
    instance-of v2, p0, La/ar4;

    .line 77
    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    move-object p0, v1

    .line 81
    :cond_2
    check-cast p0, La/ar4;

    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    iget-object v0, p0, La/ar4;->a:La/d1p;

    .line 86
    .line 87
    iget-object v1, p0, La/ar4;->b:La/ctf0;

    .line 88
    .line 89
    iget-object v2, p0, La/ar4;->c:La/yo4;

    .line 90
    .line 91
    iget-object p0, p0, La/ar4;->d:La/mne;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v3, La/g9i;

    .line 100
    .line 101
    invoke-direct {v3, v0, v1, v2, p0}, La/g9i;-><init>(La/d1p;La/ctf0;La/yo4;La/mne;)V

    .line 102
    .line 103
    .line 104
    move-object v1, v3

    .line 105
    goto :goto_2

    .line 106
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 107
    .line 108
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :goto_2
    return-object v1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
