.class public abstract La/euw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# direct methods
.method public static A(La/us00;)Landroid/app/PendingIntent;
    .locals 3

    .line 1
    const-string v0, "android.SipDemo.INCOMING_CALL"

    .line 2
    .line 3
    invoke-static {v0}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {v1}, La/rsr0;->e0(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p0, v2, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static B()La/vdd0;
    .locals 1

    .line 1
    new-instance v0, La/vdd0;

    .line 2
    .line 3
    invoke-direct {v0}, La/vdd0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static C()La/m4i0;
    .locals 1

    .line 1
    new-instance v0, La/m4i0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static D(La/v6j0;)La/nnt0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/nnt0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La/nnt0;-><init>(La/v6j0;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static a()La/ol;
    .locals 1

    .line 1
    new-instance v0, La/ol;

    .line 2
    .line 3
    invoke-direct {v0}, La/ol;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b()La/h0f;
    .locals 1

    .line 1
    new-instance v0, La/h0f;

    .line 2
    .line 3
    invoke-direct {v0}, La/h0f;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static c()La/zb30;
    .locals 1

    .line 1
    new-instance v0, La/zb30;

    .line 2
    .line 3
    invoke-direct {v0}, La/zb30;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static d()La/njo;
    .locals 2

    .line 1
    new-instance v0, La/njo;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    iput-object v1, v0, La/njo;->a:Ljava/lang/String;

    .line 9
    .line 10
    sget-object v1, La/iun;->a:La/iun;

    .line 11
    .line 12
    iput-object v1, v0, La/njo;->b:Ljava/util/List;

    .line 13
    .line 14
    return-object v0
.end method

.method public static e(La/us00;)Landroid/net/sip/SipManager;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/net/sip/SipManager;->newInstance(Landroid/content/Context;)Landroid/net/sip/SipManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static f()La/cuw;
    .locals 2

    .line 1
    new-instance v0, La/cuw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, La/duw;->d:La/duw;

    .line 7
    .line 8
    iput-object v1, v0, La/cuw;->a:La/duw;

    .line 9
    .line 10
    return-object v0
.end method

.method public static g(La/vwb0;La/vby;)La/tuy;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/tuy;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, La/tuy;-><init>(La/vwb0;La/vby;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static h(La/cs00;)La/o2z;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, La/cs00;->f()La/o2z;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public static i(La/gu70;)La/yiz;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yiz;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La/yiz;-><init>(La/gu70;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static j()La/kwz;
    .locals 1

    .line 1
    new-instance v0, La/kwz;

    .line 2
    .line 3
    invoke-direct {v0}, La/kwz;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static k(La/htz;La/lwz;La/kwz;La/njo;La/btt0;La/ctf0;)La/twz;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, La/twz;

    .line 17
    .line 18
    move-object v0, p3

    .line 19
    move-object p3, p2

    .line 20
    move-object p2, p4

    .line 21
    move-object p4, v0

    .line 22
    invoke-direct/range {p0 .. p5}, La/twz;-><init>(La/lwz;La/btt0;La/kwz;La/njo;La/ctf0;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public static l(La/dvz;La/b200;La/btt0;La/knf0;La/ctf0;)La/p200;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p0, La/p200;

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, p3, p4}, La/p200;-><init>(La/b200;La/btt0;La/knf0;La/ctf0;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public static m(La/jyz;La/c200;La/btt0;La/knf0;La/us00;)La/q200;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, La/q200;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3, p4}, La/q200;-><init>(La/c200;La/btt0;La/knf0;La/us00;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static n(La/w000;La/d200;La/ieu;La/btt0;La/knf0;La/us00;)La/r200;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, La/r200;

    .line 11
    .line 12
    invoke-direct/range {p0 .. p5}, La/r200;-><init>(La/d200;La/ieu;La/btt0;La/knf0;La/us00;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static o(La/gtz;La/a200;La/knf0;La/btt0;La/us00;)La/s200;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, La/s200;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3, p4}, La/s200;-><init>(La/a200;La/knf0;La/btt0;La/us00;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static p()La/e400;
    .locals 5

    .line 1
    new-instance v0, La/e400;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/fzz;

    .line 7
    .line 8
    sget-object v2, La/iun;->a:La/iun;

    .line 9
    .line 10
    invoke-direct {v1, v2, v2}, La/fzz;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, La/e400;->a:La/fzz;

    .line 14
    .line 15
    new-instance v1, La/d9i0;

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    const-string v4, ""

    .line 20
    .line 21
    invoke-direct {v1, v2, v3, v4}, La/d9i0;-><init>(JLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, La/e400;->b:La/d9i0;

    .line 25
    .line 26
    return-object v0
.end method

.method public static q(La/wsz;La/f400;La/btt0;La/e400;La/mne;La/kuy;)La/j400;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p0, La/j400;

    .line 14
    .line 15
    invoke-direct/range {p0 .. p5}, La/j400;-><init>(La/f400;La/btt0;La/e400;La/mne;La/kuy;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public static r(La/mne;)La/nx20;
    .locals 1

    .line 1
    new-instance v0, La/nx20;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La/nx20;-><init>(La/mne;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static s(La/q7d0;)La/v230;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/v230;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La/v230;-><init>(La/q7d0;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static t()La/jd30;
    .locals 1

    .line 1
    new-instance v0, La/jd30;

    .line 2
    .line 3
    invoke-direct {v0}, La/jd30;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static u()La/h840;
    .locals 1

    .line 1
    new-instance v0, La/h840;

    .line 2
    .line 3
    invoke-direct {v0}, La/h840;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static v()La/ft70;
    .locals 1

    .line 1
    new-instance v0, La/ft70;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static w(La/o5d0;La/o5d0;La/r9u;)La/vq70;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, La/vq70;

    .line 11
    .line 12
    new-instance v1, La/got0;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v1, p0, v2}, La/got0;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, p1, p2}, La/vq70;-><init>(La/got0;La/o5d0;La/r9u;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static x(La/k6k0;)La/yq70;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yq70;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La/yq70;-><init>(La/k6k0;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static y()La/js70;
    .locals 1

    .line 1
    new-instance v0, La/js70;

    .line 2
    .line 3
    invoke-direct {v0}, La/js70;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static z(La/ctf0;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v0, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    const v1, 0x7f130083

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
