.class public final synthetic La/lcf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:La/ybf;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;La/ybf;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lcf;->a:B

    iput-object p1, p0, La/lcf;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, La/lcf;->c:La/ybf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lcf;->a:B

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/lcf;->b:Ljava/util/concurrent/Executor;

    iget-object p0, p0, La/lcf;->c:La/ybf;

    invoke-static {v0, p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$mCecmz7sSDa7vQZdPoDQHAX0H3U(Ljava/util/concurrent/Executor;La/ybf;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_0
    iget-object v0, p0, La/lcf;->b:Ljava/util/concurrent/Executor;

    iget-object p0, p0, La/lcf;->c:La/ybf;

    invoke-static {v0, p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$VsxIaY9CMEklHrOXk5cdkiRsqcE(Ljava/util/concurrent/Executor;La/ybf;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_1
    iget-object v0, p0, La/lcf;->b:Ljava/util/concurrent/Executor;

    iget-object p0, p0, La/lcf;->c:La/ybf;

    invoke-static {v0, p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$deaEx7cFJz8WB4dww9fPUSax2YE(Ljava/util/concurrent/Executor;La/ybf;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
