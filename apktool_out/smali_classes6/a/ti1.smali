.class public final La/ti1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d9z;


# direct methods
.method public synthetic constructor <init>(La/d9z;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ti1;->a:B

    iput-object p1, p0, La/ti1;->b:La/d9z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ti1;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ti1;->b:La/d9z;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object p0, p0, La/q8z;->n:Ljava/util/List;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/q8z;->n:Ljava/util/List;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_1
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p0, p0, La/q8z;->n:Ljava/util/List;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_2
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p0, p0, La/q8z;->n:Ljava/util/List;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_3
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p0, p0, La/q8z;->n:Ljava/util/List;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
