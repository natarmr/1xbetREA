.class public final La/iki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n5d0;


# direct methods
.method public synthetic constructor <init>(La/n5d0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iki;->a:B

    iput-object p1, p0, La/iki;->b:La/n5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 3

    .line 1
    iget-byte v0, p0, La/iki;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/iki;->b:La/n5d0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/i1w0;

    .line 10
    .line 11
    new-instance v0, La/nkc0;

    .line 12
    .line 13
    check-cast p0, La/c7i;

    .line 14
    .line 15
    iget-object p0, p0, La/c7i;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/iyi;

    .line 18
    .line 19
    new-instance v2, La/tpx;

    .line 20
    .line 21
    iget-object p0, p0, La/iyi;->b:La/tnc0;

    .line 22
    .line 23
    invoke-direct {v2, p0, v1}, La/tpx;-><init>(La/tnc0;B)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1, v2}, La/nkc0;-><init>(La/i1w0;La/tpx;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 31
    .line 32
    new-instance v0, La/nkc0;

    .line 33
    .line 34
    check-cast p0, La/c7i;

    .line 35
    .line 36
    iget-object p0, p0, La/c7i;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/nli;

    .line 39
    .line 40
    new-instance v2, La/tpx;

    .line 41
    .line 42
    iget-object p0, p0, La/nli;->b:La/tnc0;

    .line 43
    .line 44
    invoke-direct {v2, p0, v1}, La/tpx;-><init>(La/tnc0;B)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, p1, v2}, La/nkc0;-><init>(La/i1w0;La/tpx;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    check-cast p1, La/i1w0;

    .line 52
    .line 53
    new-instance v0, La/nkc0;

    .line 54
    .line 55
    check-cast p0, La/c7i;

    .line 56
    .line 57
    iget-object p0, p0, La/c7i;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/fki;

    .line 60
    .line 61
    new-instance v2, La/tpx;

    .line 62
    .line 63
    iget-object p0, p0, La/fki;->b:La/tnc0;

    .line 64
    .line 65
    invoke-direct {v2, p0, v1}, La/tpx;-><init>(La/tnc0;B)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, p1, v2}, La/nkc0;-><init>(La/i1w0;La/tpx;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
