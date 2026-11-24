.class public final La/nun;
.super La/ng80;
.source "SourceFile"


# instance fields
.field public final synthetic h:B


# direct methods
.method public constructor <init>(La/ym40;La/swq;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nun;->h:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2}, La/ng80;-><init>(La/ym40;La/swq;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0, p1, p2}, La/ng80;-><init>(La/ym40;La/swq;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final y()La/cr30;
    .locals 1

    .line 1
    iget-byte p0, p0, La/nun;->h:B

    sget-object v0, La/br30;->b:La/br30;

    return-object v0
.end method
