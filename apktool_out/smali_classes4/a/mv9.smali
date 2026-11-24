.class public final La/mv9;
.super La/nv9;
.source "SourceFile"


# instance fields
.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Field;ZZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/mv9;->g:B

    invoke-direct {p0, p1, p2, p3}, La/nv9;-><init>(Ljava/lang/reflect/Field;ZZ)V

    return-void
.end method


# virtual methods
.method public e([Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/mv9;->g:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/nv9;->e([Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, La/nv9;->e([Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, La/tx3;->B([Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, La/sv9;->f(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
