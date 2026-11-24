.class public final synthetic La/lop;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q0h0;


# direct methods
.method public synthetic constructor <init>(La/q0h0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lop;->a:B

    iput-object p1, p0, La/lop;->b:La/q0h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lop;->a:B

    iget-object p0, p0, La/lop;->b:La/q0h0;

    packed-switch v0, :pswitch_data_0

    sget-object v0, La/lmc0;->Q1:La/mi70;

    return-object p0

    :pswitch_0
    sget-object v0, La/igc0;->V1:La/fl70;

    return-object p0

    :pswitch_1
    sget-object v0, La/rop;->a2:La/nek;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
