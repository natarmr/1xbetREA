.class public final synthetic La/bzj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fhj;


# direct methods
.method public synthetic constructor <init>(La/fhj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bzj;->a:B

    iput-object p1, p0, La/bzj;->b:La/fhj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/bzj;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bzj;->b:La/fhj;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/fhj;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/czj;

    .line 11
    .line 12
    iget-object p0, p0, La/czj;->i:La/nfu0;

    .line 13
    .line 14
    invoke-interface {p0}, La/nfu0;->c()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, La/fhj;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/czj;

    .line 21
    .line 22
    iget-object p0, p0, La/czj;->i:La/nfu0;

    .line 23
    .line 24
    invoke-interface {p0}, La/nfu0;->b()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
