.class public final synthetic La/ua10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ab10;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bb10;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/bb10;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ua10;->a:B

    iput-object p1, p0, La/ua10;->b:La/bb10;

    iput p2, p0, La/ua10;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/ua10;->a:B

    .line 2
    .line 3
    iget v1, p0, La/ua10;->c:I

    .line 4
    .line 5
    iget-object p0, p0, La/ua10;->b:La/bb10;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, La/bb10;->p(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, v1}, La/bb10;->t(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-virtual {p0, v1}, La/bb10;->q(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
