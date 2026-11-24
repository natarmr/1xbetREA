.class public final synthetic La/roy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;IIB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/roy;->a:B

    iput-object p1, p0, La/roy;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;

    iput p2, p0, La/roy;->c:I

    iput p3, p0, La/roy;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/roy;->a:B

    iget v1, p0, La/roy;->d:I

    iget v2, p0, La/roy;->c:I

    iget-object p0, p0, La/roy;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, v2, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->g(Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;II)V

    return-void

    :pswitch_0
    invoke-static {p0, v2, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->h(Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
