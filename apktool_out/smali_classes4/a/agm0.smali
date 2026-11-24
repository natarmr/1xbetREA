.class public final synthetic La/agm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/Window;

.field public final synthetic c:La/eme;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;La/eme;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/agm0;->a:B

    iput-object p1, p0, La/agm0;->b:Landroid/view/Window;

    iput-object p2, p0, La/agm0;->c:La/eme;

    iput-boolean p3, p0, La/agm0;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/agm0;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/agm0;->d:Z

    .line 4
    .line 5
    iget-object v2, p0, La/agm0;->c:La/eme;

    .line 6
    .line 7
    iget-object p0, p0, La/agm0;->b:Landroid/view/Window;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-static {p0, v2, v1}, La/ffb0;->N(Landroid/view/Window;La/eme;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-static {p0, v2, v1}, La/ffb0;->N(Landroid/view/Window;La/eme;Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
