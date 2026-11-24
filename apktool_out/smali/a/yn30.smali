.class public final synthetic La/yn30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rbe;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zhl;

.field public final synthetic c:La/wn00;

.field public final synthetic d:La/in30;


# direct methods
.method public synthetic constructor <init>(La/zhl;La/wn00;La/in30;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/yn30;->a:B

    iput-object p1, p0, La/yn30;->b:La/zhl;

    iput-object p2, p0, La/yn30;->c:La/wn00;

    iput-object p3, p0, La/yn30;->d:La/in30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/yn30;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/yn30;->d:La/in30;

    .line 4
    .line 5
    iget-object v2, p0, La/yn30;->c:La/wn00;

    .line 6
    .line 7
    iget-object p0, p0, La/yn30;->b:La/zhl;

    .line 8
    .line 9
    check-cast p1, La/bo30;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, p0, La/zhl;->a:I

    .line 15
    .line 16
    iget-object p0, p0, La/zhl;->b:La/vn30;

    .line 17
    .line 18
    invoke-interface {p1, v0, p0, v2, v1}, La/bo30;->j(ILa/vn30;La/wn00;La/in30;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget v0, p0, La/zhl;->a:I

    .line 23
    .line 24
    iget-object p0, p0, La/zhl;->b:La/vn30;

    .line 25
    .line 26
    invoke-interface {p1, v0, p0, v2, v1}, La/bo30;->r(ILa/vn30;La/wn00;La/in30;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
