.class public final synthetic La/riz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Ljava/lang/String;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/riz;->a:B

    iput-object p1, p0, La/riz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    iput-object p2, p0, La/riz;->c:Ljava/lang/String;

    iput-object p3, p0, La/riz;->d:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/riz;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/riz;->d:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    iget-object v3, p0, La/riz;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, La/riz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, La/vpj0;

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, La/vpj0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v3, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->l(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    new-instance v0, La/r3w;

    .line 23
    .line 24
    invoke-direct {v0, v2, v1}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v3, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->l(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
