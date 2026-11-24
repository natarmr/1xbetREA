.class public final synthetic La/nah0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oah0;


# direct methods
.method public synthetic constructor <init>(La/oah0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nah0;->a:B

    iput-object p1, p0, La/nah0;->b:La/oah0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nah0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nah0;->b:La/oah0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/oah0;->o:La/rah0;

    .line 9
    .line 10
    iget-object p0, p0, La/rah0;->f:La/cgk0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    :goto_0
    int-to-float p0, p0

    .line 17
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object p0, p0, La/oah0;->o:La/rah0;

    .line 23
    .line 24
    iget-object p0, p0, La/rah0;->a:La/cgk0;

    .line 25
    .line 26
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    goto :goto_0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
