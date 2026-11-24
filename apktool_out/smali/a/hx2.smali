.class public final synthetic La/hx2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jpq;


# direct methods
.method public synthetic constructor <init>(La/jpq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hx2;->a:B

    iput-object p1, p0, La/hx2;->b:La/jpq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hx2;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/hx2;->b:La/jpq;

    .line 4
    .line 5
    check-cast p1, La/nqq;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget p0, p0, La/jpq;->a:I

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/nqq;->h1(I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget p0, p0, La/jpq;->a:I

    .line 22
    .line 23
    invoke-virtual {p1, p0}, La/nqq;->h1(I)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_0

    .line 28
    :pswitch_1
    iget p0, p0, La/jpq;->a:I

    .line 29
    .line 30
    invoke-virtual {p1, p0}, La/nqq;->h1(I)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    goto :goto_0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
