.class public final La/ft6;
.super La/f5r;
.source "SourceFile"


# instance fields
.field public final synthetic m:B

.field public final n:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La/ikr0;Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/ft6;->m:B

    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v0

    .line 17
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 18
    invoke-direct {p0, v0, p1}, La/f5r;-><init>(Landroidx/fragment/app/e;La/glz;)V

    .line 19
    iput-object p2, p0, La/ft6;->n:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(La/zp6;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/ft6;->m:B

    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 9
    .line 10
    invoke-direct {p0, v0, p1}, La/f5r;-><init>(Landroidx/fragment/app/e;La/glz;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, La/ft6;->n:Ljava/util/ArrayList;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final B(I)Landroidx/fragment/app/Fragment;
    .locals 3

    .line 1
    iget-byte p0, p0, La/ft6;->m:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "Unknown position: "

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, La/zzs0;->a:La/zzs0;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    sget-object p0, La/oyj0;->U1:La/gle0;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, La/oyj0;

    .line 20
    .line 21
    invoke-direct {v0}, La/oyj0;-><init>()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p0, La/zzs0;->a:La/zzs0;

    .line 26
    .line 27
    if-ne p1, v2, :cond_1

    .line 28
    .line 29
    sget-object p0, La/hnc0;->R1:La/xi70;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, La/hnc0;

    .line 35
    .line 36
    invoke-direct {v0}, La/hnc0;-><init>()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {p1, v1}, La/e9d0;->d(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-object v0

    .line 44
    :pswitch_0
    if-nez p1, :cond_2

    .line 45
    .line 46
    sget-object p0, La/st6;->R1:La/yk5;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, La/st6;

    .line 52
    .line 53
    invoke-direct {v0}, La/st6;-><init>()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    if-ne p1, v2, :cond_3

    .line 58
    .line 59
    sget-object p0, La/kt6;->Q1:La/bj5;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v0, La/kt6;

    .line 65
    .line 66
    invoke-direct {v0}, La/kt6;-><init>()V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p1, v1}, La/e9d0;->d(ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    return-object v0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/ft6;->m:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/ft6;->n:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, La/ft6;->n:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
