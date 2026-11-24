.class public final synthetic La/n20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:La/ctf0;

.field public final synthetic d:La/bzt;


# direct methods
.method public synthetic constructor <init>(La/pru;La/ctf0;La/bzt;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/n20;->a:B

    iput-object p1, p0, La/n20;->b:La/pru;

    iput-object p2, p0, La/n20;->c:La/ctf0;

    iput-object p3, p0, La/n20;->d:La/bzt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/n20;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x7f131767

    .line 5
    .line 6
    .line 7
    iget-object v3, p0, La/n20;->d:La/bzt;

    .line 8
    .line 9
    iget-object v4, p0, La/n20;->c:La/ctf0;

    .line 10
    .line 11
    iget-object p0, p0, La/n20;->b:La/pru;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v5, La/ebu0;

    .line 21
    .line 22
    new-array v0, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v4, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    sget-object v7, La/cau0;->b:La/cau0;

    .line 35
    .line 36
    sget-object v8, La/x9u0;->a:La/x9u0;

    .line 37
    .line 38
    iget-boolean v9, p0, La/sff0;->u0:Z

    .line 39
    .line 40
    iget-object v0, v3, La/bzt;->a:La/fsd;

    .line 41
    .line 42
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v10, v0, La/v8d;->p:La/lxw;

    .line 47
    .line 48
    iget-boolean v11, p0, La/sff0;->M1:Z

    .line 49
    .line 50
    invoke-direct/range {v5 .. v11}, La/ebu0;-><init>(Ljava/lang/String;La/cau0;La/x9u0;ZLa/lxw;Z)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :pswitch_0
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v5, La/k20;

    .line 59
    .line 60
    new-array v0, v1, [Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 63
    .line 64
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v4, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    sget-object v7, La/cau0;->b:La/cau0;

    .line 73
    .line 74
    sget-object v8, La/e10;->a:La/e10;

    .line 75
    .line 76
    iget-boolean v9, p0, La/sff0;->u0:Z

    .line 77
    .line 78
    iget-object v0, v3, La/bzt;->a:La/fsd;

    .line 79
    .line 80
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v10, v0, La/v8d;->p:La/lxw;

    .line 85
    .line 86
    iget-boolean v11, p0, La/sff0;->M1:Z

    .line 87
    .line 88
    invoke-direct/range {v5 .. v11}, La/k20;-><init>(Ljava/lang/String;La/cau0;La/e10;ZLa/lxw;Z)V

    .line 89
    .line 90
    .line 91
    return-object v5

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
