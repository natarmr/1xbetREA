.class public final La/rke;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/reflect/Type;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Type;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rke;->a:B

    iput-object p1, p0, La/rke;->b:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rke;->a:B

    iget-object p0, p0, La/rke;->b:Ljava/lang/reflect/Type;

    return-object p0
.end method
