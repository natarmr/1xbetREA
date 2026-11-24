.class public final synthetic La/h1w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i1w0;


# direct methods
.method public synthetic constructor <init>(La/i1w0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h1w0;->a:B

    iput-object p1, p0, La/h1w0;->b:La/i1w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/h1w0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/h1w0;->b:La/i1w0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/i1w0;->d:La/jmv0;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/jmv0;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne p0, v1, :cond_0

    .line 25
    .line 26
    move v0, v1

    .line 27
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_0
    new-instance v0, La/mf50;

    .line 33
    .line 34
    iget-object p0, p0, La/i1w0;->f:La/n0o0;

    .line 35
    .line 36
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/wu4;

    .line 41
    .line 42
    invoke-direct {v0, p0}, La/mf50;-><init>(La/wu4;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    new-instance v0, La/wu4;

    .line 47
    .line 48
    new-instance v1, La/h1w0;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-direct {v1, p0, v2}, La/h1w0;-><init>(La/i1w0;B)V

    .line 52
    .line 53
    .line 54
    new-instance v2, La/gdv0;

    .line 55
    .line 56
    const/16 v3, 0x8

    .line 57
    .line 58
    invoke-direct {v2, p0, v3}, La/gdv0;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, La/wu4;-><init>(La/h1w0;La/gdv0;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
