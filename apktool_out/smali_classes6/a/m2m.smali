.class public final synthetic La/m2m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v6n;


# direct methods
.method public synthetic constructor <init>(La/v6n;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m2m;->a:B

    iput-object p1, p0, La/m2m;->b:La/v6n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/m2m;->a:B

    iget-object p0, p0, La/m2m;->b:La/v6n;

    return-object p0
.end method
