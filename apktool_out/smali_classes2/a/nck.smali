.class public final La/nck;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/c8z;


# direct methods
.method public synthetic constructor <init>(La/c8z;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nck;->a:B

    iput-object p1, p0, La/nck;->b:La/c8z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nck;->a:B

    iget-object p0, p0, La/nck;->b:La/c8z;

    return-object p0
.end method
