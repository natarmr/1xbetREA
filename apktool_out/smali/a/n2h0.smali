.class public final La/n2h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/o5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/o5d0;

.field public final c:La/o5d0;

.field public final d:La/o5d0;


# direct methods
.method public synthetic constructor <init>(La/o5d0;La/o5d0;La/o5d0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/n2h0;->a:B

    iput-object p1, p0, La/n2h0;->b:La/o5d0;

    iput-object p2, p0, La/n2h0;->c:La/o5d0;

    iput-object p3, p0, La/n2h0;->d:La/o5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/n2h0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n2h0;->d:La/o5d0;

    .line 4
    .line 5
    iget-object v2, p0, La/n2h0;->c:La/o5d0;

    .line 6
    .line 7
    iget-object p0, p0, La/n2h0;->b:La/o5d0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, La/uxs0;

    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-direct {v4, v0}, La/uxs0;-><init>(B)V

    .line 17
    .line 18
    .line 19
    new-instance v5, La/bzs0;

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    invoke-direct {v5, v0}, La/bzs0;-><init>(B)V

    .line 23
    .line 24
    .line 25
    check-cast p0, La/twj;

    .line 26
    .line 27
    invoke-virtual {p0}, La/twj;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    move-object v6, p0

    .line 32
    check-cast v6, La/swj;

    .line 33
    .line 34
    check-cast v2, La/znt0;

    .line 35
    .line 36
    invoke-virtual {v2}, La/znt0;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    move-object v7, p0

    .line 41
    check-cast v7, La/wdu;

    .line 42
    .line 43
    check-cast v1, La/bpv0;

    .line 44
    .line 45
    invoke-virtual {v1}, La/bpv0;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    move-object v8, p0

    .line 50
    check-cast v8, La/fht0;

    .line 51
    .line 52
    new-instance v3, La/eps0;

    .line 53
    .line 54
    invoke-direct/range {v3 .. v8}, La/eps0;-><init>(La/quc;La/quc;La/swj;La/wdu;La/fht0;)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :pswitch_0
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Landroid/content/Context;

    .line 63
    .line 64
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, La/wpg0;

    .line 69
    .line 70
    check-cast v1, La/nho;

    .line 71
    .line 72
    invoke-virtual {v1}, La/nho;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/y45;

    .line 77
    .line 78
    new-instance v2, La/y3v;

    .line 79
    .line 80
    const/4 v3, 0x5

    .line 81
    invoke-direct {v2, p0, v0, v1, v3}, La/y3v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
