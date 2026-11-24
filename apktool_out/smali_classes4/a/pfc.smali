.class public final synthetic La/pfc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qfc;


# direct methods
.method public synthetic constructor <init>(La/qfc;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pfc;->a:B

    iput-object p1, p0, La/pfc;->b:La/qfc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/pfc;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/pfc;->b:La/qfc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/qfc;->k2:La/a8z;

    .line 9
    .line 10
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pci;

    .line 15
    .line 16
    new-instance v0, La/fiu0;

    .line 17
    .line 18
    const-class v1, La/xgc;

    .line 19
    .line 20
    iget-object p0, p0, La/pci;->d:La/pai;

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
    sget v0, La/qfc;->m2:I

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
    const-class v0, La/rfc;

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
    instance-of v2, p0, La/rfc;

    .line 77
    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    move-object p0, v1

    .line 81
    :cond_2
    check-cast p0, La/rfc;

    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    iget-object v0, p0, La/rfc;->a:La/gr70;

    .line 86
    .line 87
    iget-object v1, p0, La/rfc;->b:La/mne;

    .line 88
    .line 89
    iget-object p0, p0, La/rfc;->c:La/m1e;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v2, La/pci;

    .line 98
    .line 99
    invoke-direct {v2, v0, v1, p0}, La/pci;-><init>(La/gr70;La/mne;La/m1e;)V

    .line 100
    .line 101
    .line 102
    move-object v1, v2

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 105
    .line 106
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    return-object v1

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
