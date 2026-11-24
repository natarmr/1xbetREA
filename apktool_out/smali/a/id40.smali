.class public final La/id40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/o5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/o5d0;

.field public final c:La/o5d0;


# direct methods
.method public synthetic constructor <init>(La/o5d0;La/o5d0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/id40;->a:B

    iput-object p1, p0, La/id40;->b:La/o5d0;

    iput-object p2, p0, La/id40;->c:La/o5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/id40;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/id40;->b:La/o5d0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v3, La/uxs0;

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    invoke-direct {v3, v0}, La/uxs0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v4, La/bzs0;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {v4, v0}, La/bzs0;-><init>(B)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v2, La/wpg0;

    .line 26
    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, La/v2h0;

    .line 29
    .line 30
    sget-object v5, La/r35;->f:La/r35;

    .line 31
    .line 32
    iget-object v7, p0, La/id40;->c:La/o5d0;

    .line 33
    .line 34
    invoke-direct/range {v2 .. v7}, La/wpg0;-><init>(La/quc;La/quc;La/r35;La/v2h0;La/o5d0;)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :pswitch_0
    check-cast v1, La/ubf;

    .line 39
    .line 40
    iget-object v0, v1, La/ubf;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroid/content/Context;

    .line 43
    .line 44
    iget-object p0, p0, La/id40;->c:La/o5d0;

    .line 45
    .line 46
    check-cast p0, La/ubf;

    .line 47
    .line 48
    invoke-virtual {p0}, La/ubf;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance v1, La/hd40;

    .line 53
    .line 54
    check-cast p0, La/cu;

    .line 55
    .line 56
    invoke-direct {v1, v0, p0}, La/hd40;-><init>(Landroid/content/Context;La/cu;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
