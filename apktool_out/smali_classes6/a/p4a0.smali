.class public final La/p4a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/szy;


# direct methods
.method public synthetic constructor <init>(La/szy;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p4a0;->a:B

    iput-object p1, p0, La/p4a0;->b:La/szy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/p4a0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/p4a0;->b:La/szy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/szy;->f:La/t6n;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, La/szy;->g:La/t6n;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
