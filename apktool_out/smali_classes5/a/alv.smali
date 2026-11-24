.class public final La/alv;
.super La/eiu0;
.source "SourceFile"


# instance fields
.field public final c:La/oeu;

.field public final d:La/xfu;

.field public final e:La/ouu;

.field public final f:La/v88;

.field public final g:La/i1w0;

.field public final h:La/oct;

.field public final i:La/peg0;

.field public final j:La/vqc;

.field public final k:La/xex;

.field public final l:La/duj;

.field public final m:La/s31;

.field public final n:La/mne;

.field public final o:La/vqc;

.field public final p:La/p7m0;

.field public final q:La/p7m0;


# direct methods
.method public constructor <init>(La/oeu;La/xfu;La/ouu;La/v88;La/std;La/i1w0;La/oct;La/peg0;La/vqc;La/xex;La/duj;La/s31;La/mne;La/vqc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/alv;->c:La/oeu;

    .line 5
    .line 6
    iput-object p2, p0, La/alv;->d:La/xfu;

    .line 7
    .line 8
    iput-object p3, p0, La/alv;->e:La/ouu;

    .line 9
    .line 10
    iput-object p4, p0, La/alv;->f:La/v88;

    .line 11
    .line 12
    iput-object p6, p0, La/alv;->g:La/i1w0;

    .line 13
    .line 14
    iput-object p7, p0, La/alv;->h:La/oct;

    .line 15
    .line 16
    iput-object p8, p0, La/alv;->i:La/peg0;

    .line 17
    .line 18
    iput-object p9, p0, La/alv;->j:La/vqc;

    .line 19
    .line 20
    iput-object p10, p0, La/alv;->k:La/xex;

    .line 21
    .line 22
    iput-object p11, p0, La/alv;->l:La/duj;

    .line 23
    .line 24
    iput-object p12, p0, La/alv;->m:La/s31;

    .line 25
    .line 26
    iput-object p13, p0, La/alv;->n:La/mne;

    .line 27
    .line 28
    iput-object p14, p0, La/alv;->o:La/vqc;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/alv;->p:La/p7m0;

    .line 36
    .line 37
    sget-object p1, La/ekv;->a:La/ekv;

    .line 38
    .line 39
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/alv;->q:La/p7m0;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final v(La/rkv;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/alv;->m:La/s31;

    .line 2
    .line 3
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const-string v0, "point"

    .line 10
    .line 11
    const-string v1, "gesture_call"

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-static {}, La/t9f;->b()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    const-string p1, "Slots"

    .line 21
    .line 22
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    const-string p1, "games"

    .line 27
    .line 28
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    const-string p1, "Cyber"

    .line 33
    .line 34
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    const-string p1, "Express"

    .line 39
    .line 40
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_4
    const-string p1, "Favor"

    .line 45
    .line 46
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_5
    const-string p1, "BetHistory"

    .line 51
    .line 52
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_6
    const-string p1, "Deposit"

    .line 57
    .line 58
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
