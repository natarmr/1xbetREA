.class public final synthetic La/bsj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sg00;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/bsj;->a:B

    iput p1, p0, La/bsj;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/ft2;ILa/ly90;La/ly90;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    iput-byte p1, p0, La/bsj;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, La/bsj;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/bsj;->a:B

    .line 2
    .line 3
    iget p0, p0, La/bsj;->b:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/ky90;

    .line 9
    .line 10
    invoke-interface {p1, p0}, La/ky90;->e(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, La/ky90;

    .line 15
    .line 16
    invoke-interface {p1, p0}, La/ky90;->D(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p1, La/gt2;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p1, La/kn30;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    if-ne p0, v0, :cond_0

    .line 29
    .line 30
    iput-boolean v0, p1, La/kn30;->v:Z

    .line 31
    .line 32
    :cond_0
    iput p0, p1, La/kn30;->l:I

    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
