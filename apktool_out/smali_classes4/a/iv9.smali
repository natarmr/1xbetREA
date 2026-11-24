.class public final La/iv9;
.super La/jv9;
.source "SourceFile"


# instance fields
.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Field;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/iv9;->f:B

    invoke-direct {p0, p1, p2}, La/jv9;-><init>(Ljava/lang/reflect/Field;Z)V

    return-void
.end method


# virtual methods
.method public e([Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/iv9;->f:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/sv9;->e([Ljava/lang/Object;)V

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
    array-length v0, p1

    .line 14
    invoke-virtual {p0, v0}, La/sv9;->d(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, La/tx3;->B([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, La/sv9;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
