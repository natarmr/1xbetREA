.class public final synthetic La/d1n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u6n;


# direct methods
.method public synthetic constructor <init>(La/u6n;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d1n;->a:B

    iput-object p1, p0, La/d1n;->b:La/u6n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/d1n;->a:B

    iget-object p0, p0, La/d1n;->b:La/u6n;

    return-object p0
.end method
