.class public final La/odk;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/qdk;


# direct methods
.method public synthetic constructor <init>(La/qdk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/odk;->a:B

    iput-object p1, p0, La/odk;->b:La/qdk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/odk;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/odk;->b:La/qdk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/rdk;->A()Ljava/lang/reflect/Member;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    new-instance v0, La/pdk;

    .line 14
    .line 15
    invoke-direct {v0, p0}, La/pdk;-><init>(La/qdk;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
