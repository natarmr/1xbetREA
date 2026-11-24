.class public final La/b1c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/b1c0;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iput-object p2, p0, La/b1c0;->b:Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/x5q0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, La/w5q0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lorg/xplatform/personal/impl/presentation/edit_tj/models/b;

    .line 11
    .line 12
    check-cast p1, La/w5q0;

    .line 13
    .line 14
    iget-object v1, p0, La/b1c0;->b:Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;

    .line 15
    .line 16
    check-cast v1, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Lorg/xplatform/personal/impl/presentation/edit_tj/models/b;-><init>(La/w5q0;Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/b1c0;->a:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method
